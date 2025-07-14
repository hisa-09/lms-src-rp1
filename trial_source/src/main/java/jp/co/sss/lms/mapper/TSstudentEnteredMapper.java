package jp.co.sss.lms.mapper;

import java.util.Date;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface TSstudentEnteredMapper {
	/**
	 * 勤怠情報（受講生入力）未入力件数取得
	 * @param lmsUserId
	 * @param deleteFlg
	 * @param trainingDate
	 * @returm
	 */
	
	Integer notEnterCount(@Param("lmsUserId") Integer lmsUserId,
			@Param("trainingDate") Date trainingDate,
			@Param("deleteFlg") Short deleteFlg );
	
}
