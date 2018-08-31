package jp.sangi.mplayer;

import android.media.MediaPlayer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


// メイン制御クラス
public class MainCtrl implements RadioGroup.OnCheckedChangeListener, View.OnClickListener {
    private MainActivity m_cActivity;   // メインアクティビティ
    private MusicManager m_cMusicManager;

    /**
     * コンストラクタ
     * @param  cActivity アクティビティ
     */
    MainCtrl(MainActivity cActivity) {
        m_cActivity = cActivity;
        m_cMusicManager = new MusicManager(cActivity);
    }

    private void playBgm(int id){

    }

    /**
     * ラジオボタンの変更イベント
     * @param  cGroup ラジオボタンのグループ
     * @param nCheckedId チェックされているボタンのID
     */
    @Override  //ここ
    public void onCheckedChanged(RadioGroup cGroup, int nCheckedId) {
        if (nCheckedId == -1) {
            Toast.makeText(m_cActivity, m_cActivity.getString(R.string.err_not_select), Toast.LENGTH_LONG).show();
        } else {
            RadioButton cRadioButton = m_cActivity.findViewById(nCheckedId);   // 指定されているボタンを取得
            String cStr = cRadioButton.getText().toString();

            switch(cStr){
                case "1":
                    m_cMusicManager.play(1);
                    break;
                case "2":
                    m_cMusicManager.play(2);
                    break;
                case "3":
                    m_cMusicManager.play(3);
                    break;
                case "4":
                    m_cMusicManager.play(4);
                    break;
                case "5":
                    m_cMusicManager.play(5);
                    break;
            }
        }
    }



    /**
     * ボタンのイベント
     * @param v ボタンのView
     * 2018.07.13 R.Suzuki  新規作成
     */
    @Override
    public void onClick(View v) {
                 m_cMusicManager.stop();
    }
}
