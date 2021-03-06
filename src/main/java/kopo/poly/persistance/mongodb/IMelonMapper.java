package kopo.poly.persistance.mongodb;

import kopo.poly.dto.MelonDTO;

import java.util.List;

public interface IMelonMapper {

	/**
	 * 멜론 노래 리스트 저장하기
	 *
	 * @param pList 저장될 정보
	 * @param colNm 저장할 컬렉션 이름
	 * @return 저장 결과
	 */
	int insertSong(List<MelonDTO> pList, String colNm) throws Exception;

	/**
	 * 오늘 수집된 멜론 노래리스트 가져오기
	 *
	 * @param colNm 조회할 컬렉션 이름
	 * @param
	 * @return 노래 리스트
	 */
	List<MelonDTO> getSongList(String colNm) throws Exception;

	/**
	 * 가수별 수집된 노래의 수 가져오기
	 *
	 * @param colNm 조회할 컬렉션 이름
	 * @return 노래 리스트
	 */
	List<MelonDTO> getSingerSongCnt(String colNm) throws Exception;

	List<MelonDTO> getSingerSong(String colNm, String singer) throws Exception;

	int insertSongMany(List<MelonDTO> pList, String colNm) throws Exception;

	int dropMelonCollection(String colNm) throws Exception;

	int updateSong(String colNm, String singer, String updateSinger) throws Exception;

	int deleteSong(String colNm, String singer) throws Exception;

	int updateSongAddField(String colNm, String singer, String nickname) throws Exception;

    int updateSongAddListField(String colNm, String singer, List<String> member) throws Exception;

	int updateManySong(String colNm, String singer, String updateSinger, String updateSong) throws Exception;

	int deleteOne(String colNm, String singer) throws Exception;



}
