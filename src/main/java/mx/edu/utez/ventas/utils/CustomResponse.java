package mx.edu.utez.ventas.utils;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CustomResponse<T> {
    T obj;
    Boolean error;
    int statusCode;
    String message;
}
