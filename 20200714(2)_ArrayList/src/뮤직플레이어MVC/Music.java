package �����÷��̾�MVC;

public class Music {
	//Model, VO(value object), ��ü
	
	//�ʵ�,�Ӽ�,����
		//���,�����̸�,����ð�,�ּҰ�
		private String songName;
		private String singer;
		private int playTime;
		private String path;
		
		
		//�����ڴ� �װ��� �ʵ带 ���� ä�� �� �ְ� ������ּ���.
		public Music(String songName, String singer, int playTime, String path) {
			this.songName = songName;
			this.singer = singer;
			this.playTime = playTime;
			this.path = path;
		}
		
		
		//getter, setter ������ּ���
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
