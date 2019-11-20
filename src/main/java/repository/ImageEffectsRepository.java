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

/**
 * @author Billy Bissic
 *
 */
public interface ImageEffectsRepository extends CrudRepository<ImageEffects, Long> {
	
	@Query("SELECT image_effect_id, image_style_id, image_effect_name, image_effect_description FROM ImageEffects WHERE image_effect_id = ?1")
	Optional<ImageEffects> findById(Integer image_effect_id);
	
	long count();
}
