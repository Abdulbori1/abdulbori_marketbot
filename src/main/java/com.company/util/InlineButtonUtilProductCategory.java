package com.company.util;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.List;

public class InlineButtonUtilProductCategory {

    /**
     *
     * Product Category Mebellar
     *
     */

    public static InlineKeyboardMarkup menuProductCategoryMebellarKeyboardUZB() {
        InlineKeyboardButton button1 = InlineButtonUtilManager.button("Yumshoq mebellar", "yumshoq_mebellar_uz");
        InlineKeyboardButton button2 = InlineButtonUtilManager.button("Stol stullar", "stol_stullar_uz");
        InlineKeyboardButton button3 = InlineButtonUtilManager.button("Pinal-kamod", "pinal_kamod_uz");
        InlineKeyboardButton button4 = InlineButtonUtilManager.button("Oshxona mebellari", "oshxona_mebellari_uz");
        InlineKeyboardButton button5 = InlineButtonUtilManager.button("Bog' va dalahovli mebellari", "bog_dalahovli_mebellar_uz");
        InlineKeyboardButton button6 = InlineButtonUtilManager.button("Spalni, garnitura", "spalni_garnitura_uz");
        InlineKeyboardButton button7 = InlineButtonUtilManager.button("Shkaflar", "shkaflar_uz");
        InlineKeyboardButton button8 = InlineButtonUtilManager.button("Kachela, dam olish", "kachela_dam_olish_uz");
        InlineKeyboardButton button9 = InlineButtonUtilManager.button("Bolalar karavatlari va shkaflari", "bolalar_karavotlari_uz");
        List<InlineKeyboardButton> row1 = InlineButtonUtilManager.row(button1, button2);
        List<InlineKeyboardButton> row2 = InlineButtonUtilManager.row(button3, button4);
        List<InlineKeyboardButton> row3 = InlineButtonUtilManager.row(button5, button6);
        List<InlineKeyboardButton> row5 = InlineButtonUtilManager.row(button7, button8);
        List<InlineKeyboardButton> row4 = InlineButtonUtilManager.row(button9);
        return InlineButtonUtilManager.keyboard(InlineButtonUtilManager.rowList(row1, row2, row5, row3, row4));
    }

    public static InlineKeyboardMarkup menuProductCategoryMebellarKeyboardRUS() {
        InlineKeyboardButton button1 = InlineButtonUtilManager.button("???????????? ????????????", "yumshoq_mebellar_rus");
        InlineKeyboardButton button2 = InlineButtonUtilManager.button("???????? ????????????", "stol_stullar_rus");
        InlineKeyboardButton button3 = InlineButtonUtilManager.button("??????????-??????????", "pinal_kamod_rus");
        InlineKeyboardButton button4 = InlineButtonUtilManager.button("???????????????? ????????????", "oshxona_mebellari_rus");
        InlineKeyboardButton button5 = InlineButtonUtilManager.button("?????????????? ?? ?????????????? ????????????", "bog_dalahovli_mebellar_rus");
        InlineKeyboardButton button6 = InlineButtonUtilManager.button("??????????????, ????????????????", "spalni_garnitura_rus");
        InlineKeyboardButton button7 = InlineButtonUtilManager.button("??????????", "shkaflar_rus");
        InlineKeyboardButton button8 = InlineButtonUtilManager.button("????????????, ??????????", "kachela_dam_olish_rus");
        InlineKeyboardButton button9 = InlineButtonUtilManager.button("?????????????? ???????????????? ?? ??????????", "bolalar_karavotlari_rus");
        List<InlineKeyboardButton> row1 = InlineButtonUtilManager.row(button1, button2);
        List<InlineKeyboardButton> row2 = InlineButtonUtilManager.row(button3, button4);
        List<InlineKeyboardButton> row3 = InlineButtonUtilManager.row(button5, button6);
        List<InlineKeyboardButton> row5 = InlineButtonUtilManager.row(button7, button8);
        List<InlineKeyboardButton> row4 = InlineButtonUtilManager.row(button9);
        return InlineButtonUtilManager.keyboard(InlineButtonUtilManager.rowList(row1, row2, row5, row3, row4));
    }

    public static InlineKeyboardMarkup menuProductCategoryMebellarKeyboardKRILL() {
        InlineKeyboardButton button1 = InlineButtonUtilManager.button("?????????? ????????????????", "yumshoq_mebellar_krill");
        InlineKeyboardButton button2 = InlineButtonUtilManager.button("???????? ??????????????", "stol_stullar_krill");
        InlineKeyboardButton button3 = InlineButtonUtilManager.button("??????????-??????????", "pinal_kamod_krill");
        InlineKeyboardButton button4 = InlineButtonUtilManager.button("???????????? ??????????????????", "oshxona_mebellari_krill");
        InlineKeyboardButton button5 = InlineButtonUtilManager.button("?????? ???? ?????????????????? ??????????????????", "bog_dalahovli_mebellar_krill");
        InlineKeyboardButton button6 = InlineButtonUtilManager.button("????????????, ??????????????????", "spalni_garnitura_krill");
        InlineKeyboardButton button7 = InlineButtonUtilManager.button("??????????????", "shkaflar_krill");
        InlineKeyboardButton button8 = InlineButtonUtilManager.button("????????????, ?????? ????????", "kachela_dam_olish_krill");
        InlineKeyboardButton button9 = InlineButtonUtilManager.button("?????????????? ?????????????????????? ???? ????????????????", "bolalar_karavotlari_krill");
        List<InlineKeyboardButton> row1 = InlineButtonUtilManager.row(button1, button2);
        List<InlineKeyboardButton> row2 = InlineButtonUtilManager.row(button3, button4);
        List<InlineKeyboardButton> row3 = InlineButtonUtilManager.row(button5, button6);
        List<InlineKeyboardButton> row5 = InlineButtonUtilManager.row(button7, button8);
        List<InlineKeyboardButton> row4 = InlineButtonUtilManager.row(button9);
        return InlineButtonUtilManager.keyboard(InlineButtonUtilManager.rowList(row1, row2, row5, row3, row4));
    }

    /**
     *
     *
     * Bu methodlarga ProductId callbackQuery sifatida keladi sababi product sotib olish va muddatli tolov va boshqa
     * ishlarni biroz osonlashtiradi tiliga qarab.
     *
     */

    public static InlineKeyboardMarkup menuSingleKeyboardUZB(Integer productId) {
        InlineKeyboardButton button1 = InlineButtonUtilManager.button("Muddatli to'lov", "muddatli_tolov_uz_" + productId);
        InlineKeyboardButton button2 = InlineButtonUtilManager.button("Buyurtma Berish", "buyurtma_berish_uz_" + productId);
        InlineKeyboardButton button3 = InlineButtonUtilManager.button("Savatchaga qo'shish", "savatchaga_qoshish_uz_" + productId);
        List<InlineKeyboardButton> row1 = InlineButtonUtilManager.row(button1, button2);
        List<InlineKeyboardButton> row3 = InlineButtonUtilManager.row(button3);
        return InlineButtonUtilManager.keyboard(InlineButtonUtilManager.rowList(row1,row3));
    }

    public static InlineKeyboardMarkup menuSingleKeyboardRUS(Integer productId) {
        InlineKeyboardButton button1 = InlineButtonUtilManager.button("?????????????? ????????????", "muddatli_tolov_rus_" + productId);
        InlineKeyboardButton button2 = InlineButtonUtilManager.button("??????????", "buyurtma_berish_rus_" + productId);
        InlineKeyboardButton button3 = InlineButtonUtilManager.button("???????????????? ?? ??????????????", "savatchaga_qoshish_rus_" + productId);
        List<InlineKeyboardButton> row1 = InlineButtonUtilManager.row(button1, button2);
        List<InlineKeyboardButton> row3 = InlineButtonUtilManager.row(button3);
        return InlineButtonUtilManager.keyboard(InlineButtonUtilManager.rowList(row1,row3));
    }

    public static InlineKeyboardMarkup menuSingleKeyboardKRILL(Integer productId) {
        InlineKeyboardButton button1 = InlineButtonUtilManager.button("???????????????? ??????????", "muddatli_tolov_krill_" + productId);
        InlineKeyboardButton button2 = InlineButtonUtilManager.button("?????????????? ??????????", "buyurtma_berish_krill_" + productId);
        InlineKeyboardButton button3 = InlineButtonUtilManager.button("?????????????????? ??????????", "savatchaga_qoshish_krill_" + productId);
        List<InlineKeyboardButton> row1 = InlineButtonUtilManager.row(button1, button2);
        List<InlineKeyboardButton> row3 = InlineButtonUtilManager.row(button3);
        return InlineButtonUtilManager.keyboard(InlineButtonUtilManager.rowList(row1,row3));
    }

    /**
     *
     *
     * Buyurtmani yetkazish yoki dostacka qilish
     *
     */

    public static InlineKeyboardMarkup menuBuyurtmaTypeKeyboardUZB(Integer buyurtmaId) {
        InlineKeyboardButton button1 = InlineButtonUtilManager.button("Yetkazib Berish", "yetkazib_berish_uz_" + buyurtmaId);
        InlineKeyboardButton button2 = InlineButtonUtilManager.button("O'zim olib kelaman", "olib_ketish_uz_" + buyurtmaId);
        List<InlineKeyboardButton> row1 = InlineButtonUtilManager.row(button1, button2);
        return InlineButtonUtilManager.keyboard(InlineButtonUtilManager.rowList(row1));
    }

    public static InlineKeyboardMarkup menuBuyurtmaTypeKeyboardRUS(Integer buyurtmaId) {
        InlineKeyboardButton button1 = InlineButtonUtilManager.button("????????????????", "yetkazib_berish_ru_" + buyurtmaId);
        InlineKeyboardButton button2 = InlineButtonUtilManager.button("?? ?????? ??????????????", "olib_ketish_ru_" + buyurtmaId);
        List<InlineKeyboardButton> row1 = InlineButtonUtilManager.row(button1, button2);
        return InlineButtonUtilManager.keyboard(InlineButtonUtilManager.rowList(row1));
    }

    public static InlineKeyboardMarkup menuBuyurtmaTypeKeyboardKRILL(Integer buyurtmaId) {
        InlineKeyboardButton button1 = InlineButtonUtilManager.button("?????????????? ??????????", "yetkazib_berish_krill_" + buyurtmaId);
        InlineKeyboardButton button2 = InlineButtonUtilManager.button("???????? ???????? ??????????????", "olib_ketish_krill_" + buyurtmaId);
        List<InlineKeyboardButton> row1 = InlineButtonUtilManager.row(button1, button2);
        return InlineButtonUtilManager.keyboard(InlineButtonUtilManager.rowList(row1));
    }

    /**
     *
     *
     * Joylashuv yuborish uchun bot tiliga qarab
     *
     */

    public static ReplyKeyboardMarkup menuSingleKeyboardsUzb() {
        KeyboardButton button3 = new KeyboardButton("\uD83D\uDCCD Joylashuvni yuborish");
        button3.setRequestLocation(true);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(button3);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(List.of(row2));

        return replyKeyboardMarkup;
    }

    public static ReplyKeyboardMarkup menuSingleKeyboardsRus() {
        KeyboardButton button3 = new KeyboardButton("\uD83D\uDCCD ?????????????????? ????????????????????????????");
        button3.setRequestLocation(true);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(button3);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(List.of(row2));

        return replyKeyboardMarkup;
    }

    public static ReplyKeyboardMarkup menuSingleKeyboardsKrill() {
        KeyboardButton button3 = new KeyboardButton("\uD83D\uDCCD ???????????????????? ????????????");
        button3.setRequestLocation(true);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(button3);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(List.of(row2));

        return replyKeyboardMarkup;
    }

    /**
     *
     *
     * Buyurtmalarni admin tasdiqlashi kerak ana shuning uchun kerak boladigan method
     *
     */

    public static InlineKeyboardMarkup menuCheckBuyurtmaKeyboardUZB(Integer userId) {
        InlineKeyboardButton button1 = InlineButtonUtilManager.button("Buyurtmalarni Tasdiqlash", "buyurtmalarni_tasdiqlash_uz_" + userId);
        InlineKeyboardButton button2 = InlineButtonUtilManager.button("Buyurtmalarni korib chiqish", "buyurtmalarni_korish_uz_" + userId);
        List<InlineKeyboardButton> row1 = InlineButtonUtilManager.row(button1);
        List<InlineKeyboardButton> row2 = InlineButtonUtilManager.row(button2);
        return InlineButtonUtilManager.keyboard(InlineButtonUtilManager.rowList(row1, row2));
    }

    public static InlineKeyboardMarkup menuCheckBuyurtmaKeyboardRUS(Integer buyurtmaId) {
        InlineKeyboardButton button1 = InlineButtonUtilManager.button("?????????????????????? ????????????", "buyurtmalarni_tasdiqlash_rus_" + buyurtmaId);
        InlineKeyboardButton button2 = InlineButtonUtilManager.button("?????????????????????? ????????????", "buyurtmalarni_korish_rus_" + buyurtmaId);
        List<InlineKeyboardButton> row1 = InlineButtonUtilManager.row(button1);
        List<InlineKeyboardButton> row2 = InlineButtonUtilManager.row(button2);
        return InlineButtonUtilManager.keyboard(InlineButtonUtilManager.rowList(row1, row2));
    }

    public static InlineKeyboardMarkup menuCheckBuyurtmaKeyboardKRILL(Integer buyurtmaId) {
        InlineKeyboardButton button1 = InlineButtonUtilManager.button("???????????????????????? ??????????????????", "buyurtmalarni_tasdiqlash_krill_" + buyurtmaId);
        InlineKeyboardButton button2 = InlineButtonUtilManager.button("???????????????????????? ?????????? ??????????", "buyurtmalarni_korish_krill_" + buyurtmaId);
        List<InlineKeyboardButton> row2 = InlineButtonUtilManager.row(button1);
        List<InlineKeyboardButton> row1 = InlineButtonUtilManager.row(button2);
        return InlineButtonUtilManager.keyboard(InlineButtonUtilManager.rowList(row1, row2));
    }

    /**
     *
     *
     * Buyurtmalarni user yetib borgan yoki bormaganini aytishi kerak
     *
     */

    public static InlineKeyboardMarkup menuStatusBuyurtmaKeyboardUZB(Integer userId) {
        InlineKeyboardButton button1 = InlineButtonUtilManager.button("Buyurtma Yetib keldi", "buyurma_yetib_keldi_uz_" + userId);
        List<InlineKeyboardButton> row1 = InlineButtonUtilManager.row(button1);
        return InlineButtonUtilManager.keyboard(InlineButtonUtilManager.rowList(row1));
    }

    public static InlineKeyboardMarkup menuStatusBuyurtmaKeyboardRUS(Integer buyurtmaId) {
        InlineKeyboardButton button1 = InlineButtonUtilManager.button("?????????? ????????????", "buyurma_yetib_keldi_ru_" + buyurtmaId);
        List<InlineKeyboardButton> row1 = InlineButtonUtilManager.row(button1);
        return InlineButtonUtilManager.keyboard(InlineButtonUtilManager.rowList(row1));
    }

    public static InlineKeyboardMarkup menuStatusBuyurtmaKeyboardKRILL(Integer buyurtmaId) {
        InlineKeyboardButton button1 = InlineButtonUtilManager.button("?????????????? ???????? ??????????", "buyurma_yetib_keldi_krill_" + buyurtmaId);
        List<InlineKeyboardButton> row2 = InlineButtonUtilManager.row(button1);
        return InlineButtonUtilManager.keyboard(InlineButtonUtilManager.rowList(row2));
    }

    /**
     *
     * Bu methoslar Savatchadan narsa sotib olishga yordam beradi tiliga qarab
     *
     */

    public static InlineKeyboardMarkup menuBuyurtmaTypeSavatchaKeyboardUZB(Integer userId) {
        InlineKeyboardButton button1 = InlineButtonUtilManager.button("Yetkazib Berish", "yetkazib_berish_savatcha_uz_" + userId);
        InlineKeyboardButton button2 = InlineButtonUtilManager.button("O'zim olib kelaman", "olib_ketish_savatcha_uz_" + userId);
        InlineKeyboardButton button3 = InlineButtonUtilManager.button("Savatchani Tozalash", "tozalash_uz_" + userId);
        List<InlineKeyboardButton> row1 = InlineButtonUtilManager.row(button1, button2);
        List<InlineKeyboardButton> row2 = InlineButtonUtilManager.row(button3);
        return InlineButtonUtilManager.keyboard(InlineButtonUtilManager.rowList(row1, row2));
    }

    public static InlineKeyboardMarkup menuBuyurtmaTypeSavatchaKeyboardRUS(Integer userId) {
        InlineKeyboardButton button1 = InlineButtonUtilManager.button("????????????????", "yetkazib_berish_savatcha_ru_" + userId);
        InlineKeyboardButton button2 = InlineButtonUtilManager.button("?? ?????? ??????????????", "olib_ketish_savatcha_ru_" + userId);
        InlineKeyboardButton button3 = InlineButtonUtilManager.button("?????????????? ??????????????", "tozalash_ru_" + userId);
        List<InlineKeyboardButton> row1 = InlineButtonUtilManager.row(button1, button2);
        List<InlineKeyboardButton> row2 = InlineButtonUtilManager.row(button3);
        return InlineButtonUtilManager.keyboard(InlineButtonUtilManager.rowList(row1, row2));
    }

    public static InlineKeyboardMarkup menuBuyurtmaTypeSavatchaKeyboardKRILL(Integer userId) {
        InlineKeyboardButton button1 = InlineButtonUtilManager.button("?????????????? ??????????", "yetkazib_berish_savatcha_krill_" + userId);
        InlineKeyboardButton button2 = InlineButtonUtilManager.button("???????? ???????? ??????????????", "olib_ketish_savatcha_krill_" + userId);
        InlineKeyboardButton button3 = InlineButtonUtilManager.button("?????????????????? ??????????????", "tozalash_krill_" + userId);
        List<InlineKeyboardButton> row1 = InlineButtonUtilManager.row(button1, button2);
        List<InlineKeyboardButton> row2 = InlineButtonUtilManager.row(button3);
        return InlineButtonUtilManager.keyboard(InlineButtonUtilManager.rowList(row1, row2));
    }
}
