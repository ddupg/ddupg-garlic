package io.ddupg.garlic.function;

import java.io.IOException;

@FunctionalInterface
public interface IOExceptionFunction<T, R> extends ExceptionFunction<T, R, IOException> {
  R apply(T t) throws IOException;
}
