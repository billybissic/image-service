/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package exception;

import domain.ImageMetaData;

/**
 * @author Billy Bissic
 *
 */

public class ImageMetaDataNotFoundException extends RuntimeException {

	public ImageMetaDataNotFoundException(ImageMetaData imageMetaData) {
		super("No image meta for this image.");
	}
}
