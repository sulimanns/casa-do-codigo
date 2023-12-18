package com.casadocodigo.casadocodigo.validators.cpfOrCnpj;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = CpfOrCnpjValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface CpfOrCnpj {

    String message() default "CPF ou CNPJ inválido";
    Class<?>[] groups() default {}; //PADRÃO
    Class<? extends Payload>[] payload() default {}; //PADRÃO

}

