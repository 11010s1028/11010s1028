import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    public List<Integer> generate (Integer number) {

        
        List<Integer> generateList = new ArrayList<Integer>();

        //�f������F�v�Z���Q��̂��̂��i�[����i�P�Ǝ������g�ł�������؂�Ȃ����߁j

        int n = 2; //�f������̑Ώ�
        int count = 0;//�Q�񂩔��肷��Ώ�
        

        for (int i = 0; i < number; n++) { //number�͑f���̌����w�肷�����

            count = 0; //count�̃��Z�b�g

            for (int j = 1; j <= n; j++){//�P���玩�����g�̐��܂Ŋ���Z

                if (n % j == 0) {
                    count++;
                }

            }
            if(count == 2) {
                generateList.add(n);

                i++;
            }


        }
        
        return generateList;

        //Integer result;

        //result = generateList.get(number);
        

        
    }
}