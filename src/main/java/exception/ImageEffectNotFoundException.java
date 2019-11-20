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

public class ImageEffectNotFoundException extends RuntimeException {

	public ImageEffectNotFoundException(ImageEffects imageEffect) {
		super("Image Effect: '" + imageEffect.getImage_effect_name() + "' not found.");
	}
}
