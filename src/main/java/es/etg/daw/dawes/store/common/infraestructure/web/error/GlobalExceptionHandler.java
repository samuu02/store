package es.etg.daw.dawes.store.pokemon.infraestructure.web.error;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    // 1. Manejo de NullPointerException (HTTP 500)
    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> nullPointerHandler(NullPointerException nfe) {
        String msg = nfe.getMessage() != null ? nfe.getMessage() : "Se ha producido un error de puntero nulo.";
        CustomResponse cr = new CustomResponse(LocalDateTime.now(), HttpStatus.INTERNAL_SERVER_ERROR, msg);

        String html = buildErrorHtml(cr, "Error interno en el servidor");

        return ResponseEntity
                .status(cr.getStatus())
                .contentType(MediaType.TEXT_HTML)
                .body(html);
    }

    // 2. Manejo Centralizado de Errores de Validación (HTTP 400)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> handleValidationExceptions(MethodArgumentNotValidException ex) {
        StringBuilder html = new StringBuilder(256);
        html.append("<!DOCTYPE html>")
            .append("<html lang=\"es\"><head><meta charset=\"UTF-8\">")
            .append("<title>Errores de validación</title></head><body>")
            .append("<h1>Errores de validación</h1>")
            .append("<ul>");

        ex.getBindingResult().getAllErrors().forEach(error -> {
            String field   = (error instanceof FieldError fe) ? fe.getField() : error.getObjectName();
            String message = error.getDefaultMessage();

            html.append("<li><strong>")
                .append(escapeHtml(field))
                .append("</strong>: ")
                .append(escapeHtml(message))
                .append("</li>");
        });

        html.append("</ul></body></html>");

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .contentType(MediaType.TEXT_HTML)
                .body(html.toString());
    }

    // 3. Manejo Genérico para Excepciones No Controladas (HTTP 500)
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> genericExceptionHandler(Exception ex) {
        String msg = ex.getMessage() != null ? ex.getMessage() : "Error no esperado en el servidor.";
        CustomResponse cr = new CustomResponse(LocalDateTime.now(), HttpStatus.INTERNAL_SERVER_ERROR, msg);

        String html = buildErrorHtml(cr, "Error inesperado");

        return ResponseEntity
                .status(cr.getStatus())
                .contentType(MediaType.TEXT_HTML)
                .body(html);
    }

    private String buildErrorHtml(CustomResponse cr, String title) {
        return """
                <!DOCTYPE html>
                <html lang="es">
                <head>
                    <meta charset="UTF-8">
                    <title>%s</title>
                </head>
                <body>
                    <div class="card">
                        <h1>Se ha producido un error</h1>
                        <dl>
                            <dt>Fecha</dt>   <dd>%s</dd>
                            <dt>Código</dt>  <dd>%s - %s</dd>
                            <dt>Mensaje</dt> <dd>%s</dd>
                        </dl>
                    </div>
                </body>
                </html>
                """.formatted(
                        escapeHtml(title),
                        escapeHtml(String.valueOf(cr.getDate())),
                        cr.getStatus().value(),
                        escapeHtml(cr.getStatus().getReasonPhrase()),
                        escapeHtml(cr.getMessage()));
    }

    private String escapeHtml(String s) {
        if (s == null) return "";
        return s.replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;")
                .replace("\"", "&quot;")
                .replace("'", "&#39;");
    }
}