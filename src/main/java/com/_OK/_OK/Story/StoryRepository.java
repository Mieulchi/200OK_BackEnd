package com._OK._OK.Story;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoryRepository extends JpaRepository<Story,Long>   {
   Story findBeforeContentByUser_Id(Long userId);
   Story findByUserId(Long userId);
}
