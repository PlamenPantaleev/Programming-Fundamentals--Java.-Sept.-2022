package FundamentalsLab.ObjectsAndClasses;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs_04 {

    private static class Song {
        private String typeList;
        private String name;
        private String time;

        public String getTypeList() {
            return typeList;
        }
        public void setTypeList (String typeList) {
            this.typeList = typeList;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSongs = Integer.parseInt(scanner.nextLine());

        List<Song> songList = new ArrayList<>();

        for (int i = 1; i <= numberOfSongs; i++) {
            String [] songData = scanner.nextLine().split("_");
            String typeList = songData[0];
            String songName = songData[1];
            String time = songData[2];

            Song song = new Song();

            song.setTypeList(typeList);
            song.setName(songName);
            song.setTime(time);

            songList.add(song);
        }
        String typeList = scanner.nextLine();

        if (typeList.equals("all")) {
            for (Song song: songList) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song: songList) {
                if (song.getTypeList().equals(typeList)) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}
