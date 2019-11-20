/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package exception;

import domain.ImageLinks;

/**
 * @author Billy Bissic
 *
 */

public class ImageLinkAlreadyExistsException extends RuntimeException {

	public ImageLinkAlreadyExistsException(ImageLinks imageLink) {
		super("Image already has an existing link.");
	}
}
