//������� ������ ������ �� ����� � ������ � ������������, ����� ��� ���� ���� 
//���������
//�������� ������ - �����
//��������� ������ - ������ � ������� ����� (���� - ��� �����, �������� - 
//�������� �����)
function read_form($form) {
    return $form.serializeArray().reduce(function (obj, item) {
        name_p = "#error_" + item.name;
        if (item.value == '') {
            $(name_p).text("��������� ����!");
            return;
        }
        $(name_p).text("");
        obj[item.name] = item.value;
        return obj;
    }, {});
}

