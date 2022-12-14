/*
 *Author Name:Praveen Kumar
 *Date: 24-Nov-22
 *Created With IntelliJ Idea Community Edition
 */


package com.niit.jdp.BEJ_C2_S3_REST_API_MONGODB_PC_1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT, reason = "Customer Already Exist")
public class CustomerAlreadyExistException extends Exception {
}
