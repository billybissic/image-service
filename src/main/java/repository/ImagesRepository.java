/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import domain.ImageEffects;
import domain.Images;

/**
 * @author Billy Bissic
 *
 */

public interface ImagesRepository extends CrudRepository<Images, Long> {

	@Query("SELECT image_id, image_meta_data_id FROM Images WHERE image_id = ?1")
	Optional<ImageEffects> findbyId(Integer image_id);

}
