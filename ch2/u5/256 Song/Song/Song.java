public class Song {
		// attributes
		private String artist;
    private String songTitle;
    private int minutes;
    private int seconds;

		//constructor
    public Song(String artist, String songTitle, int minutes, int seconds) {
        this.artist = artist;
        this.songTitle = songTitle;
        this.minutes = minutes;
        this.seconds = seconds;
    }

		public String getArtist() {
				return this.artist;
		}

		public void setArtist(String artist) {
				this.artist = artist;
		}

		public String getSongTitle() {
				return this.songTitle;
		}

		public void setSongTitle(String songTitle) {
				this.songTitle = songTitle;
		}

		public int getMinutes() {
				return this.minutes;
		}

		public void setMinutes(int minutes) {
				this.minutes = minutes;
		}

		public int getSeconds() {
				return this.seconds;
		}

		public void setSeconds(int seconds) {
				this.seconds = seconds;
		}

		// I REALLY hope I did the indenting right here (it was a bit of a mess before)
		public boolean betterSong(Song otherSong) {
				if (this.minutes > otherSong.getMinutes()) {
						return true;
				} else if (this.minutes < otherSong.getMinutes()) {
						return false;
				} else {
						if (this.seconds > otherSong.getSeconds()) {
								return true;
						} else {
								return false;
						}
				}
		}

		public String toString() {
				return "Artist Name = " + this.artist + "\nSong Title = " + this.songTitle + "\nTime (min:sec) = " + this.minutes + ":" + String.format("%02d", this.seconds); // added the format because I got annoyed at having '9:8' as output
		}
}