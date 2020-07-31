package 뮤직플레이어MVC;

public class Music {
	//Model, VO(value object), 객체
	
	//필드,속성,변수
		//곡명,가수이름,재생시간,주소값
		private String songName;
		private String singer;
		private int playTime;
		private String path;
		
		
		//생성자는 네가지 필드를 전부 채울 수 있게 만들어주세요.
		public Music(String songName, String singer, int playTime, String path) {
			this.songName = songName;
			this.singer = singer;
			this.playTime = playTime;
			this.path = path;
		}
		
		
		//getter, setter 만들어주세요
		public String getSongName() {
			return songName;
		}
		public void setSongName(String songName) {
			this.songName = songName;
		}
		public String getSinger() {
			return singer;
		}
		public void setSinger(String singer) {
			this.singer = singer;
		}
		public int getPlayTime() {
			return playTime;
		}
		public void setPlayTime(int playTime) {
			this.playTime = playTime;
		}
		public String getPath() {
			return path;
		}
		public void setPath(String path) {
			this.path = path;
		}
		
		
		
		
		
		
		
	
	
	
	
}
