/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package exception;

import domain.OldImages;

/**
 * @author Billy Bissic
 *
 */

public class OldImageNotFoundException extends RuntimeException {

	public OldImageNotFoundException(OldImages oldImage) {
		super("Unable to find Old Image: '" + oldImage.getOld_image_id() + "'");
	}
}
