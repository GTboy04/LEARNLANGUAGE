//
// Created by FZHgt on 2024/3/9.
//

#include "iostream"
//#include "stdlib.h"
using namespace std;
// �õ���

template <class T>
class SquList{
private:

protected:
    T* data;
    int maxSize;
    int last;
public:
    SquList(int size);
    ~SquList();
    /**
 *
 * @param site ���site������������±�����
 * @param value Ҫ�����ֵ
 */
    void insertValue(int site,int value);


    /**
     * �̶�����1.5��
     */
    void extendSql();

    /**
     *
     * @param index Ҫɾ�����ݵ�����
     */
    void deleteValue(int index);

    int findByValue(T i);

    void concat(SquList<T> squList);


/**
 * ��˳����˳��������Ԫ��
 * @param i Ҫ��ӵ�Ԫ��
 */
    void addLast(T i){
        last++;
        if (last >= maxSize){
            last = last-1;
            cout<<"�������������ɽ�������"<<endl;
            return;
        } else{
            data[last] = i;
        }
    }

    void recordValue(){
        int i;
        scanf("%d",&i);
        while (i != 0){
            addLast(i);
            scanf("%d",&i);
        }
        return;


    }
/**
 * ������鳤��
 * @return
 */
    int getLength(){
        return last+1;
    }

    /**
     * ��������
     */
    void showList(){
        if (last == -1){
            cout<<"����Ϊ�գ������Ԫ��";
            return;
        }
        for (int i = 0; i <= last; i++){
            cout<<data[i]<< endl;
        }
    }

    /**
     * ��֤��չ�����ԣ���ȡmaxSize
     */
     int getMaxSize(){
        return maxSize;
     }

};

template<class T>
void SquList<T>::insertValue(int site, int value) {
    if (-1>=site||maxSize<=site){
        cout<<"����Խ��"<<endl;
        return;
    } else{
        if (last+1>=maxSize){
            cout<<"��Ҫ����"<<endl;
            return;
        }
        for (int i = last; i >= site; i--){
            data[i+1] = data[i];
        }
        data[site] = value;
        last++;
    }

}

template <class T>
SquList<T>::SquList(int size){
    //���������±�
    last = -1;
    //��������
    maxSize = size;
    //��ʼ������
    data = new T[size];
    for (int i = 0; i < size; ++i){
        data[i] = 0;
    }

}

template<class T>
SquList<T>::~SquList() {
////    cout<<"??????"<<endl;
    delete[] data;
}

template<class T>
void SquList<T>::extendSql(){
    int extendSize = maxSize+ (maxSize>>1);
    T* p = new T[extendSize];
    for (int i = 0; i < extendSize; ++i){
        p[i] = 0;
    }
    for (int i = 0; i <= last; ++i) {
        p[i] = data[i];
    }
    data = p;
    maxSize = extendSize;
//    delete[] p;

}

template<class T>
void SquList<T>::deleteValue(int index) {
    if (-1>=index&&maxSize<=index&&maxSize == 0){
        cout<<"ɾ������Խ��"<<endl;
        return;
    }
    for (int i = index; i <= last ; ++i){
        data[i] = data[i+1];
    }
    data[last] = 0;
    last--;
}

template<class T>
int SquList<T>::findByValue(T i) {
    if (last == -1){
        cout<<"����Ϊ�գ������Ԫ��";
        return -1;
    }
    for (int j = 0; j <= last; j++){
        if (i == data[j]){
            return j;
        }
    }
    return -1;
}

template<class T>
void SquList<T>::concat(SquList<T> squList) {
    bool flag = true;
    int index = squList.last;
    for (int i = 0; i <= index; ++i){
        for (int j = 0; j <= last; ++j){
            if (squList.data[i] == data[j]){
                flag = false;
            }
        }
        if (flag){
            insertValue(last+1,squList.data[i]);
        }else{
            flag = false;
        }
    }
}



int main() {

    SquList<int> squList1 = SquList<int>(10);
    squList1.addLast(1);
    squList1.addLast(2);
    squList1.addLast(3);
    squList1.addLast(4);
    SquList<int> squList2 = SquList<int>(10);
    squList2.addLast(5);
    squList2.addLast(6);
    squList2.addLast(7);
    squList2.addLast(8);
    squList1.concat(squList2);
    squList1.showList();



    /*int order,size;
    bool flag = true;
    cout<<"��������Ҫ������˳������������";
    scanf("%d",&size);
    SquList<int> squList = SquList<int>(size);
    while (flag){
        cout<<"0.�˳�"<<endl;
        cout<<"1.�������ݽ���˳���"<<endl;
        cout<<"2.�������ݽ���˳���"<<endl;
        cout<<"3.����ֵ���±�����"<<endl;
        cout<<"4.����˳�������"<<endl;
        cout<<"5.����˳���1.5��"<<endl;
        cout<<"6.������鳤��"<<endl;
        cout<<"7.��������ɾ��˳���������"<<endl;
        cout<<"8.�鿴�������"<<endl;
        cout<<"�������";
        scanf("%d",&order);

        switch (order) {
            case 0:{
                flag = false;
                break;
            }
            case 1:{
                cout<<"������Ҫ��ӵ�ֵ/����0�˳���";
               squList.recordValue();
                break;

            }
            case 2:{
                cout<<"������������ݵ�������ֵ��";
                int site,value;
                scanf("%d %d",&site,&value);
                squList.insertValue(site,value);
                break;
            }
            case 3:{
                cout<<"�����������е�ֵ��";
                int value;
                scanf("%d",&value);
                int re = squList.findByValue(value);
                cout<<re<<endl;
                break;
            }
            case 4:{
                squList.showList();
                break;
            }
            case 5:{
                squList.extendSql();
                cout<<"ok"<<endl;
                break;
            }
            case 6:{
                cout<<"����";
                cout<<squList.getLength()<<endl;
                break;
            }
            case 7:{
                cout<<"������ɾ�����ݵ�������";
                int index;
                scanf("%d",&index);
                squList.deleteValue(index);
                break;
            }
            case 8:{
                cout<<"xxx"<<endl;
                cout<<squList.getMaxSize()<<endl;
                break;
            }
        }*/




//        cout<<"0.�˳�"<<endl;
//        cout<<"1.�������ݽ���˳���"<<endl;
//        cout<<"2.�������ݽ���˳���"<<endl;
//        cout<<"3.����ֵ���±�����"<<endl;
//        cout<<"4.����˳�������"<<endl;
//        cout<<"5.����˳���1.5��"<<endl;
//        cout<<"6.������鳤��"<<endl;
//        cout<<"7.��������ɾ��˳���������"<<endl;
//        cout<<"8.�鿴�������"<<endl;
//        cout<<"�������";
//        scanf("%d",&order);

        return EXIT_SUCCESS;

    }

//    squList.addLast(1);
//    squList.addLast(2);
//    squList.addLast(3);
//    squList.addLast(4);
//    squList.addLast(5);
//    int index = squList.findByValue(1);
//    cout<<index;

//    SquList<int> squList = SquList<int>(10);
//    squList.deleteValue(2);
//    squList.showList();
//    squList.addLast(7);
//    squList.insertValue(1,4);
//    squList.showList();
//    int size1 = squList.getMaxSize();
//    cout<<size1<<endl;
//    squList.extendSql();
//    int size2 = squList.getMaxSize();
//    cout<<size2<<endl;




