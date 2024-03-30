//
// Created by FZHgt on 2024/3/9.
//

#include "iostream"
//#include "stdlib.h"
using namespace std;
// 用的类

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
 * @param site 这个site代表的是数组下标索引
 * @param value 要插入的值
 */
    void insertValue(int site,int value);


    /**
     * 固定扩容1.5倍
     */
    void extendSql();

    /**
     *
     * @param index 要删除数据的索引
     */
    void deleteValue(int index);

    int findByValue(T i);

    void concat(SquList<T> squList);


/**
 * 按顺序向顺序表中添加元素
 * @param i 要添加的元素
 */
    void addLast(T i){
        last++;
        if (last >= maxSize){
            last = last-1;
            cout<<"此数组已满，可进行扩容"<<endl;
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
 * 获得数组长度
 * @return
 */
    int getLength(){
        return last+1;
    }

    /**
     * 遍历数组
     */
    void showList(){
        if (last == -1){
            cout<<"数组为空，请添加元素";
            return;
        }
        for (int i = 0; i <= last; i++){
            cout<<data[i]<< endl;
        }
    }

    /**
     * 验证拓展可行性：获取maxSize
     */
     int getMaxSize(){
        return maxSize;
     }

};

template<class T>
void SquList<T>::insertValue(int site, int value) {
    if (-1>=site||maxSize<=site){
        cout<<"索引越界"<<endl;
        return;
    } else{
        if (last+1>=maxSize){
            cout<<"需要扩容"<<endl;
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
    //可以理解成下标
    last = -1;
    //数组容量
    maxSize = size;
    //初始化数组
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
        cout<<"删除索引越界"<<endl;
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
        cout<<"数组为空，请添加元素";
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
    cout<<"请输入你要创建是顺序表最大容量：";
    scanf("%d",&size);
    SquList<int> squList = SquList<int>(size);
    while (flag){
        cout<<"0.退出"<<endl;
        cout<<"1.增加数据进入顺序表"<<endl;
        cout<<"2.插入数据进入顺序表"<<endl;
        cout<<"3.根据值找下标索引"<<endl;
        cout<<"4.遍历顺序表数据"<<endl;
        cout<<"5.扩大顺序表1.5倍"<<endl;
        cout<<"6.获得数组长度"<<endl;
        cout<<"7.根据索引删除顺序表中数据"<<endl;
        cout<<"8.查看最大容量"<<endl;
        cout<<"输入命令：";
        scanf("%d",&order);

        switch (order) {
            case 0:{
                flag = false;
                break;
            }
            case 1:{
                cout<<"请输入要添加的值/输入0退出：";
               squList.recordValue();
                break;

            }
            case 2:{
                cout<<"请输入插入数据的索引和值：";
                int site,value;
                scanf("%d %d",&site,&value);
                squList.insertValue(site,value);
                break;
            }
            case 3:{
                cout<<"请输入数组中的值：";
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
                cout<<"长度";
                cout<<squList.getLength()<<endl;
                break;
            }
            case 7:{
                cout<<"请输入删除数据的索引：";
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




//        cout<<"0.退出"<<endl;
//        cout<<"1.增加数据进入顺序表"<<endl;
//        cout<<"2.插入数据进入顺序表"<<endl;
//        cout<<"3.根据值找下标索引"<<endl;
//        cout<<"4.遍历顺序表数据"<<endl;
//        cout<<"5.扩大顺序表1.5倍"<<endl;
//        cout<<"6.获得数组长度"<<endl;
//        cout<<"7.根据索引删除顺序表中数据"<<endl;
//        cout<<"8.查看最大容量"<<endl;
//        cout<<"输入命令：";
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




