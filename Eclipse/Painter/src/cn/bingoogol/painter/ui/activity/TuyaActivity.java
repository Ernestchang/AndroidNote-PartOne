package cn.bingoogol.painter.ui.activity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import cn.bingoogol.painter.R;
import cn.bingoogol.painter.ui.view.TuyaView;
import cn.bingoogol.painter.ui.view.TuyaView.MaskFilterType;
import cn.bingoogol.painter.ui.view.TuyaView.XfermodeType;

public class TuyaActivity extends Activity {
	private TuyaView mTuyaView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tuya);
		mTuyaView = (TuyaView) findViewById(R.id.tyv_tuya);
	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_red:
			mTuyaView.setColor(Color.RED);
			break;
		case R.id.btn_green:
			mTuyaView.setColor(Color.GREEN);
			break;
		case R.id.btn_blue:
			mTuyaView.setColor(Color.BLUE);
			break;
		case R.id.btn_mask_emboss:
			mTuyaView.setMaskFilter(MaskFilterType.EMBOSSMASK);
			break;
		case R.id.btn_mask_blur:
			mTuyaView.setMaskFilter(MaskFilterType.BLURMASK);
			break;
		case R.id.btn_mask_none:
			mTuyaView.setMaskFilter(MaskFilterType.NONEMASK);
			break;
		case R.id.btn_xfermode_clear:
			mTuyaView.setXfermodeType(XfermodeType.CLEARXFERMODE);
			break;
		case R.id.btn_xfermode_srcatop:
			mTuyaView.setXfermodeType(XfermodeType.SRCATOPXFERMODE);
			break;
		case R.id.btn_xfermode_none:
			mTuyaView.setXfermodeType(XfermodeType.NONEXFERMODE);
			break;
		case R.id.btn_redo:
			mTuyaView.redo();
			break;
		case R.id.btn_undo:
			mTuyaView.undo();
			break;
		case R.id.btn_save2sdcard:
			mTuyaView.save2SDCard();
			break;
		case R.id.btn_recoverfromsdcard:
			mTuyaView.recoverFromSDCard();
			break;
		case R.id.btn_save2sp:
			mTuyaView.save2Sp();
			break;
		case R.id.btn_recoverfromsp:
			mTuyaView.recoverFromSp();
			break;

		default:
			break;
		}
	}

}
