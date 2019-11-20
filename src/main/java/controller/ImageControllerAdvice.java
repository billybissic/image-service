/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import exception.ImageEffectAlreadyExistsException;
import exception.ImageEffectNotFoundException;
import exception.ImageLinkAlreadyExistsException;
import exception.ImageLinkNotFoundException;
import exception.ImageMetaDataNotFoundException;
import exception.ImageStyleAlreadyExistsException;
import exception.ImageStyleNotFoundException;
import exception.NoDataAvailableException;
import exception.OldImageNotFoundException;

import org.springframework.hateoas.VndErrors;

/**
 * @author Billy Bissic
 *
 */

@ControllerAdvice
@RequestMapping(produces = "application/vnd.error")
public class ImageControllerAdvice {

	@ResponseBody
	@ExceptionHandler(ImageEffectAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	VndErrors imageEffectAlreadyExistsExceptionHandler(ImageEffectAlreadyExistsException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(ImageLinkAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	VndErrors imageLinkAlreadyExistsException(ImageLinkAlreadyExistsException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(ImageStyleAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	VndErrors imageStyleAlreadyExistsException(ImageStyleAlreadyExistsException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(NoDataAvailableException.class)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	VndErrors noDataAvailableException(NoDataAvailableException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(ImageEffectNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors imageEffectNotFoundException(ImageEffectNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(ImageLinkNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors imageLinkNotFoundException(ImageLinkNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(ImageMetaDataNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors imageMetaDataNotFoundException(ImageMetaDataNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(ImageStyleNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors imageStyleNotFoundException(ImageStyleNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(OldImageNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors oldImageNotFoundException(OldImageNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
}
