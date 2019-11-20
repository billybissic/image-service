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

import domain.ImageLinks;

/**
 * @author Billy Bissic
 *
 */

public interface ImageLinksRepository extends CrudRepository<ImageLinks, Long>{

	@Query("SELECT image_link_id, image_url, image_id FROM ImageLinks WHERE image_id = ?1")
	Optional<ImageLinks> findByImageId(Integer image_id);
	
	long count();
}
