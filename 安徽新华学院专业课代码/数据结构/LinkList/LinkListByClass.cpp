//
// Created by FZHgt on 2024/3/30.
//

#include "iostream"
using namespace std;

class LinkList{
    class Node{
    public:
//        TODO:定义内部类的属性
        Node* next;
        int coefficient;
        int pow;
        
//        TODO:内部类的构造函数
        Node(int value,int pow){
            this->next = nullptr;
            this->coefficient = value;
            this ->pow = pow;
        }
        
        Node(){
            this->next = nullptr;
            this->coefficient = 0;
            this->pow = 0;
        }

        
    };

protected:
    //    TODO:创建内部类，一个节点
    Node* createNode(int value,int pow){
        return new Node(value,pow);
    };
    Node* createNode(){
        return new Node();
    }
public:
    //TODO:    这里是定义的头节点
    Node* head;
//    TODO：链表对头节点进行初始化
    LinkList(){
        this->head = new Node();
        head->next = nullptr;
    }
    
    void PrevInsert(int value,int pow){
//        创建一个节点准备插
        Node *pNode = createNode(value, pow);
        pNode->next = head->next;
        head->next = pNode;
    }
//   TODO:遍历链表
    void showLinkList(){
        Node*  node = this->head;
        while (node->next != nullptr){
            cout<<"value:"<<node->next->coefficient<<"\t";
            cout<<"pow:"<<node->next->pow<<endl;
            node = node->next;
        }
        cout<<"LinkList遍历结束"<<endl;
    }

    void mergeLinkList(LinkList* &linkList){
        if (linkList == nullptr){
            return;
        }
        Node* OutNode = linkList->head;
        while (OutNode->next != nullptr){
            Node* InnerNode = this->head;
            while (InnerNode->next != nullptr){
                if (InnerNode->next->pow == OutNode->next->pow){
                    InnerNode->next->coefficient += OutNode->next->coefficient;
                    break;
                } else{
                    InnerNode = InnerNode->next;
                }
            }
            OutNode = OutNode->next;
        }
    }
};


int main(){
    LinkList *pList01 = new LinkList();
    pList01->PrevInsert(4,1);
    pList01->PrevInsert(5,2);
    pList01->PrevInsert(3,3);
    LinkList *pList02 = new LinkList();
    pList02->PrevInsert(-1,1);
    pList02->PrevInsert(-1,2);
    pList02->PrevInsert(-1,3);

    pList01->showLinkList();
    pList02->showLinkList();

    pList01->mergeLinkList(pList02);
    pList01->showLinkList();

    return EXIT_SUCCESS;
}