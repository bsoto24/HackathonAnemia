package pe.openlab.hackatonanemia

import android.os.Bundle
import android.support.design.widget.BottomSheetDialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class BottomSheetBeneficiario : BottomSheetDialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.bs_dialog_beneficiario, container, false)
    }

    companion object {

        fun newInstance(): BottomSheetBeneficiario {
            return BottomSheetBeneficiario()
        }
    }
}
