/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package exception;

import domain.ImageStyles;

/**
 * @author Billy Bissic
 *
 */

public class ImageStyleAlreadyExistsException extends RuntimeException {

		public ImageStyleAlreadyExistsException(ImageStyles imageStyle) {
			super("Image Style already exists for Style: '" + imageStyle.getImage_style_name() + "'");
		}
}
