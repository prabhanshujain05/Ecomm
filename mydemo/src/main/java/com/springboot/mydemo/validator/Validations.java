package com.springboot.mydemo.validator;

import java.util.Arrays;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.springboot.mydemo.response.RestResponse;
import com.springboot.mydemo.response.StatusResponse;

/**
 * The Class Validations.
 * 
 * validate the class object according to parameter passes
 */
//
public class Validations {

    /**
     * Validate.
     *
     * @param requestDto the request dto
     * @param array      the array
     * @return the rest response
     */
    public RestResponse validate(Object requestDto, String[] array) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Set<ConstraintViolation<Object>> violations = null;

        violations = validator.validate(requestDto);
        for (ConstraintViolation<Object> violation : violations) {
            if (Arrays.asList(array).indexOf(violation.getPropertyPath().toString()) != -1) {
                if (violation.getMessage().toString() != null) {
                    return new StatusResponse(400, violation.getMessage(), requestDto);
                }
            }
        }
        return null;
    }

}
