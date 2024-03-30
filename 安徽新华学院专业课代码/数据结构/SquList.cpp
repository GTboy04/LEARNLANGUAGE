#include <iostream>

using namespace std;


struct SequenceList {
    int elements[100]; 
    int size; 


    SequenceList() {
        size = 0;
    }


    void addElement(int element) {
        if (size < 100) {
            elements[size] = element;
            size++;
        }
    }


    void merge(const SequenceList& otherList) {
        for (int i = 0; i < otherList.size; ++i) {
            bool duplicate = false;
            int num = otherList.elements[i];

            for (int j = 0; j < size; ++j) {
                if (elements[j] == num) {
                    duplicate = true;
                    break;
                }
            }
            // 如果没有重复，则添加到当前顺序表中
            if (!duplicate) {
                if (size < 100) {
                    elements[size] = num;
                    size++;
                }
            }
        }
        // 对合并后的顺序表进行排序，可删掉
        for (int i = 0; i < size - 1; ++i) {
            for (int j = i + 1; j < size; ++j) {
                if (elements[i] > elements[j]) {
                    int temp = elements[i];
                    elements[i] = elements[j];
                    elements[j] = temp;
                }
            }
        }
    }

    // 打印顺序表中的元素
    void print() const {
        cout << "Merged List: ";
        for (int i = 0; i < size; ++i) {
            cout << elements[i] << " ";
        }
        cout << endl;
    }
};

int main() {
    // 定义两个示例顺序表
    SequenceList list1;
    list1.addElement(1);
    list1.addElement(3);
    list1.addElement(5);
    list1.addElement(7);
    list1.addElement(9);

    SequenceList list2;
    list2.addElement(2);
    list2.addElement(4);
    list2.addElement(6);
    list2.addElement(8);
    list2.addElement(10);


    list1.merge(list2);


    list1.print();

    return 0;
}
