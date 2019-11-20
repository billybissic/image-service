/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package exception;

import domain.Images;

/**
 * @author Billy Bissic
 *
 */

public class ImageNotFoundException extends RuntimeException {
	
	public ImageNotFoundException(Images image) {
		super("Unable to find Image: '" + image.getImage_id() + "'");
	}

}
