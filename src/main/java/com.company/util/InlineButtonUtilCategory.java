package com.company.util;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.List;

public class InlineButtonUtilCategory {

    /**
     *
     * category Manu
     *
     */

    public static InlineKeyboardMarkup menuCategoryKeyboardUZB() {
        InlineKeyboardButton button1 = InlineButtonUtilManager.button("Mebellar", "mebellar_uz");
        InlineKeyboardButton button2 = InlineButtonUtilManager.button("Maishiy Texnikalar", "maishiy_texnikalar_uz");
        InlineKeyboardButton button3 = InlineButtonUtilManager.button("Telefonlar, aksesuralar, gadjetlar", "telegon_va_psv_uz");
        InlineKeyboardButton button4 = InlineButtonUtilManager.button("Noutbuk, PC, Printer", "noutbuk_va_psv_uz");
        InlineKeyboardButton button5 = InlineButtonUtilManager.button("Gilamlar", "gilamlar_uz");
        InlineKeyboardButton button6 = InlineButtonUtilManager.button("Televizor, Audio jihoz", "televizor_va_jihozlar_uz");
        InlineKeyboardButton button7 = InlineButtonUtilManager.button("Sport anjomlari", "sport_anjomlari_uz");
        InlineKeyboardButton button8 = InlineButtonUtilManager.button("Sovg'alar, suvinerlar", "sovgalar_uz");
        InlineKeyboardButton button9 = InlineButtonUtilManager.button("Oshxona jihozlari", "oshxona_jihozlari_uz");
        List<InlineKeyboardButton> row1 = InlineButtonUtilManager.row(button1, button2);
        List<InlineKeyboardButton> row2 = InlineButtonUtilManager.row(button3, button4);
        List<InlineKeyboardButton> row3 = InlineButtonUtilManager.row(button5, button6);
        List<InlineKeyboardButton> row5 = InlineButtonUtilManager.row(button7, button8);
        List<InlineKeyboardButton> row4 = InlineButtonUtilManager.row(button9);
        return InlineButtonUtilManager.keyboard(InlineButtonUtilManager.rowList(row1, row2, row5, row3, row4));
    }

    public static InlineKeyboardMarkup menuCategoryKeyboardRUS() {
        InlineKeyboardButton button1 = InlineButtonUtilManager.button("????????????", "mebellar_rus");
        InlineKeyboardButton button2 = InlineButtonUtilManager.button("?????????????? ??????????????", "maishiy_texnikalar_rus");
        InlineKeyboardButton button3 = InlineButtonUtilManager.button("????????????????, ????????????????????, ??????????????", "telefon_va_psv_rus");
        InlineKeyboardButton button4 = InlineButtonUtilManager.button("??????????????, ????, ??????????????", "noutbuk_va_psv_rus");
        InlineKeyboardButton button5 = InlineButtonUtilManager.button("??????????", "gilamlar_rus");
        InlineKeyboardButton button6 = InlineButtonUtilManager.button("????, ????????????????????????", "televizor_va_jihozlar_rus");
        InlineKeyboardButton button7 = InlineButtonUtilManager.button("???????????????????? ????????????????????????", "sport_anjomlari_rus");
        InlineKeyboardButton button8 = InlineButtonUtilManager.button("??????????????, ????????????????", "sovgalar_rus");
        InlineKeyboardButton button9 = InlineButtonUtilManager.button("???????????????? ??????????????", "oshxona_jihozlari_rus");
        List<InlineKeyboardButton> row1 = InlineButtonUtilManager.row(button1, button2);
        List<InlineKeyboardButton> row2 = InlineButtonUtilManager.row(button3, button4);
        List<InlineKeyboardButton> row3 = InlineButtonUtilManager.row(button5, button6);
        List<InlineKeyboardButton> row5 = InlineButtonUtilManager.row(button7, button8);
        List<InlineKeyboardButton> row4 = InlineButtonUtilManager.row(button9);
        return InlineButtonUtilManager.keyboard(InlineButtonUtilManager.rowList(row1, row2, row5, row3, row4));
    }

    public static InlineKeyboardMarkup menuCategoryKeyboardKRILL() {
        InlineKeyboardButton button1 = InlineButtonUtilManager.button("????????????????", "mebellar_krill");
        InlineKeyboardButton button2 = InlineButtonUtilManager.button("???????????? ????????????????????", "maishiy_texnikalar_krill");
        InlineKeyboardButton button3 = InlineButtonUtilManager.button("????????????????????, ??????????????????????, ??????????????????", "telegon_va_psv_krill");
        InlineKeyboardButton button4 = InlineButtonUtilManager.button("??????????????, ????, ??????????????", "noutbuk_va_psv_krill");
        InlineKeyboardButton button5 = InlineButtonUtilManager.button("????????????????", "gilamlar_krill");
        InlineKeyboardButton button6 = InlineButtonUtilManager.button("??????????????????, ?????????? ??????????", "televizor_va_jihozlar_krill");
        InlineKeyboardButton button7 = InlineButtonUtilManager.button("?????????? ??????????????????", "sport_anjomlari_krill");
        InlineKeyboardButton button8 = InlineButtonUtilManager.button("????????????????, ????????????????????", "sovgalar_krill");
        InlineKeyboardButton button9 = InlineButtonUtilManager.button("???????????? ??????????????????", "oshxona_jihozlari_krill");
        List<InlineKeyboardButton> row1 = InlineButtonUtilManager.row(button1, button2);
        List<InlineKeyboardButton> row2 = InlineButtonUtilManager.row(button3, button4);
        List<InlineKeyboardButton> row3 = InlineButtonUtilManager.row(button5, button6);
        List<InlineKeyboardButton> row5 = InlineButtonUtilManager.row(button7, button8);
        List<InlineKeyboardButton> row4 = InlineButtonUtilManager.row(button9);
        return InlineButtonUtilManager.keyboard(InlineButtonUtilManager.rowList(row1, row2, row5, row3, row4));
    }
}
