package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int goBackward = 0;
        int goForward = 0;

        for (int i = startIndex; i >= 0; i--){
            if (playList[i].equals(selection)){
                System.out.println(goBackward);
                break;
            }
            if (i==0){
                i = playList.length;
            }
            goBackward++;
        }

        for (int i = startIndex; i <= playList.length; i++){
            if (i == playList.length){
                i = 0;
            }
            if (playList[i].equals(selection)){
                System.out.println(goForward);
                break;

            }
            goForward++;
        }

        if (goBackward < goForward){
            return goBackward;
        } else return goForward;
    }

    public static void main(String[] args) {
        String[] playlist = {"wheniseeyouagain","borntorun","nothingelsematters","cecelia"};
        Music music = new Music(playlist);
        music.selection(2, "cecelia");
    }
}
