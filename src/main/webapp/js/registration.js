$(document).ready(function () {
    $("#registr_but").click(function () {
        let form = read_form($("#registr_form"));
        //��������� ������� �������, ��� ������������ ������ ���� ����������, 
        //��������� �����

        //���
        if (form.name.includes(" ")) {
            $("#error_name").append("� ����� ������������ �� ������ ����������� �������");
            return;
        }

        //���� ��������
        if (new Date(form.bday) > new Date()) {
            $('#error_bday').append('�� ��� �� �������� :)');
            return;
        }
        if ((new Date().getFullYear() - new Date(form.bday).getFullYear()) > 100) {
            $('#error_bday').append('��� ������� ����� ���');
            return;
        }

        //�����
        if (!(/^.+@.+\..+$/.test(form.email))) {
            $('#error_email').append('�������� ������ ����������� �����');
        }

        //������
        if (form.password.length < 3) {
            $('#error_password').append('����� ������ ������ ���� ������ 3');
            return;
        }
        if (form.password !== form.double_password) {
            $('#error_password').append('������ �� ���������');
            return;
        }

        $.ajax({
            type: 'POST',
            url: 'Registration',
            data: form,
            success: function(response){
               // alert(response);
            }
        });

        //
        //alert(form.name);
    });
});


