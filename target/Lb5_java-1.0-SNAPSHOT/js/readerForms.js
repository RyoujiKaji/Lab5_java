//Функция читает данные из формы в объект и контролирует, чтобы все поля были 
//заполнены
//Входящие данные - форма
//Выходящие данные - объект с данными формы (ключ - имя формы, значение - 
//значение формы)
function read_form($form) {
    return $form.serializeArray().reduce(function (obj, item) {
        name_p = "#error_" + item.name;
        if (item.value == '') {
            $(name_p).text("Заполните поле!");
            return;
        }
        $(name_p).text("");
        obj[item.name] = item.value;
        return obj;
    }, {});
}

