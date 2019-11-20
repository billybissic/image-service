/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package repository;

import org.springframework.data.repository.CrudRepository;

import domain.ImageMetaData;

/**
 * @author Billy Bissic
 *
 */

public interface ImageMetaDataRepository extends CrudRepository<ImageMetaData, Long> {

}
