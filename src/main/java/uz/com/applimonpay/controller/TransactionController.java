package uz.com.applimonpay.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.com.applimonpay.base.BaseURI;
import uz.com.applimonpay.common.ResponseData;
import uz.com.applimonpay.dto.transaction.ReqTransactionConfirmDTO;
import uz.com.applimonpay.dto.transaction.ReqTransactionHoldDTO;
import uz.com.applimonpay.dto.transaction.ResTransactionConfirmDTO;
import uz.com.applimonpay.dto.transaction.ResTransactionHoldDTO;

@RestController
@RequestMapping(BaseURI.API1 + BaseURI.TRANSACTION)
public class TransactionController {

    @PostMapping(BaseURI.HOLD)
    public ResponseEntity<ResponseData<ResTransactionHoldDTO>> hold(@RequestBody ReqTransactionHoldDTO dto) {
        // Transaction service
        // 1. OperationType ni aniqlash
        // 2. OperationCode ni aniqlash
        // 3. Commission ni hisoblash
        // 4. Epos tablitsadan operation Code ga qarab epos topiladi
        // 5. operation yaratilinadi (hold status bn)
        return null;
    }

    @PostMapping(BaseURI.CONFIRM)
    public ResponseEntity<ResponseData<ResTransactionConfirmDTO>> confirm(@RequestBody ReqTransactionConfirmDTO dto) {
        // Transaction service
        // 1. Operation mavjudligini tekshirish
        // 2. Operation need confirm bo'lsa confirm code ni check qilasz
        // 3. Debit Transaction yatalinadi (Pending)
        // 4. Debit transaction ni processing markazga yuborish (Success)
        // 5. Credit Transaction yaratilinadi
        // 6. Credit transaction ni processing markazga yuborish (Success)
        // 7. Operation set status success (end time)
        // 8. success message
        return null;
    }

    @PostMapping(BaseURI.HISTORY)
    public ResponseEntity<ResponseData<?>> history() {
        // 1. Start date va end date ga ko'ra klientni tranzaksiyalar tarixini chiqarish
        // 2. Vaqti bo'yicha desc sort
        // 3. Debit bo'lsa, amount -ko'rsatilsin
        // 4. Credit bo'lsa, amount  +ko'rsatilsin
        // 5. Jami debit summa va jami credit summa ham qaytarilsin
        return null;
    }

}
