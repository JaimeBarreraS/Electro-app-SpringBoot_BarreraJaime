package com.electro.electro_app.infraestructure.utils.validations;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = ExistsByCountryNameValidation.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ExistsByCountryName {

    String message() default "ya existe en la base de datos, escoja otro nombre";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
