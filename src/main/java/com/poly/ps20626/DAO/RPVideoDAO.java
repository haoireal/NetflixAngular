package com.poly.ps20626.DAO;

import java.util.ArrayList;
import java.util.List;

import com.poly.ps20626.Entity.*;

public class RPVideoDAO extends AbstractDAO<Object[]> {
	public List<VideoLikedInfo> findVideoLikedInfo(){
		String sql = "SELECT v.id,  v.title, v.href, sum(cast(f.isLiked as int)) AS totalLike "
				+ "FROM Video v "
				+ "LEFT JOIN favorite f on v.id = f.videoID "
				+ "GROUP BY v.id, v.title, v.href";
		
		List<Object[]> objects = super.findManyByNativeQuery(sql);
		List<VideoLikedInfo> rs = new ArrayList<>();
		objects.forEach(object -> {
			VideoLikedInfo likedInfo = new VideoLikedInfo();
			likedInfo.setVideoID((Integer)object[0]);
			likedInfo.setTitle((String)object[1]);
			likedInfo.setHref((String)object[2]);
			likedInfo.setTotalLike(object[3] == null ? 0 : (Integer)object[3]);
			rs.add(likedInfo);
		}); 
		return rs;
		
	}
	
	
}
