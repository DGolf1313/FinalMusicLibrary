DROP TABLE IF EXISTS song;
DROP TABLE IF EXISTS album;
DROP TABLE IF EXISTS musician_band;
DROP TABLE IF EXISTS band;
DROP TABLE IF EXISTS musician;

CREATE TABLE musician (
  musician_id INT AUTO_INCREMENT NOT NULL,
  first_name CHAR(50) NOT NULL,
  last_name CHAR(50) NOT NULL,
  alias_name CHAR(50),
  PRIMARY KEY (musician_id)
);

CREATE TABLE band (
  band_id INT AUTO_INCREMENT NOT NULL,
  band_name VARCHAR(150) NOT NULL,
  PRIMARY KEY (band_id)
);

CREATE TABLE musician_band (
  musician_id INT NOT NULL,
  band_id INT NOT NULL,
  FOREIGN KEY (musician_id) REFERENCES musician (musician_id) ON DELETE CASCADE,
  FOREIGN KEY (band_id) REFERENCES band (band_id) ON DELETE CASCADE,
  UNIQUE KEY (musician_id, band_id)
);

CREATE TABLE album (
  album_id INT AUTO_INCREMENT NOT NULL,
  band_id INT NOT NULL,
  album_name VARCHAR(1000) NOT NULL,
  PRIMARY KEY (album_id),
  FOREIGN KEY (band_id) REFERENCES band (band_id) ON DELETE CASCADE
);

CREATE TABLE song (
  song_id INT AUTO_INCREMENT NOT NULL,
  album_id INT NOT NULL,
  song_name VARCHAR(1000) NOT NULL,
  song_length TIME NOT NULL,
  PRIMARY KEY (song_id),
  FOREIGN KEY (album_id) REFERENCES album (album_id) ON DELETE CASCADE
);


