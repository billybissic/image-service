/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package exception;

import domain.ImageEffects;

/**
 * @author Billy Bissic
 *
 */

public class ImageEffectAlreadyExistsException extends RuntimeException {
	
	public ImageEffectAlreadyExistsException(ImageEffects imageEffect) {
		super("Image Effect already exists for Effect: '" + imageEffect.getImage_effect_name() + "," + imageEffect.getImage_effect_description() + "'");
	}

}
