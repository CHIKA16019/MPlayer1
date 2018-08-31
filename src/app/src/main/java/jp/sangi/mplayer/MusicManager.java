package jp.sangi.mplayer;

import android.content.Context;
import android.media.MediaPlayer;

public class MusicManager {
    private MediaPlayer mBgm;  //音声オブジェクト

    Context mContext = null;

    //コピコン
    MusicManager(Context context) {
        mContext = context;
    }

    //音声のリソースIDの取得
    private int getBgmResld(int id) {
        int ret = R.raw.song_kei_recuerdo;
        switch (id) {
            case 1:
                ret = R.raw.song_kei_recuerdo;
                break;
            case 2:
                ret = R.raw.song_rosukey_soreha_shinkiro_datta;
                break;
            case 3:
                ret = R.raw.song_kouichi_murasaki_no_anemone;
                break;
            case 4:
                ret = R.raw.song_shiho_shining_star;
                break;
            case 5:
                ret = R.raw.song_kei_burning_heart;
            default:
                break;
        }
        return ret;
    }

    //再生
    public void play(int id) {

        int ret;
        ret = getBgmResld(id);

        mBgm = MediaPlayer.create(mContext, ret);//getBgmResld(id);
        mBgm.setLooping(true);
        mBgm.start();
    }

    //停止
    public void stop(){
        mBgm.stop();
        mBgm.release();
    }
}