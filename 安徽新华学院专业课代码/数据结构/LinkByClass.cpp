//
// Created by FZHgt on 2024/3/14.
//

#include "iostream"
using namespace std;
class LinkList{
private:
    class Node{
    public:
        int value;
        Node *next;
        Node(){
            this->next = nullptr;
        }
    };
public:
    Node *head = new Node;
    LinkList(){

    }

    void addFirstNode(int value){
        Node *node = new Node;
        node->value = value;
        if (head->next == nullptr){
            head->next = node;
        } else{
            node->next = head->next;
            head->next = node;
        }
    }

    void showLinkList(){
        if (head->next == nullptr){
            return;
        }else{
            Node *node = head->next;
            while (node != nullptr){
                cout<<node->value<<endl;
                node = node->next;
            }


        }
    }
};


int main(){
    LinkList *linkList = new LinkList();
    linkList->addFirstNode(1);
    linkList->addFirstNode(2);
    linkList->addFirstNode(3);
    linkList->showLinkList();

    return EXIT_SUCCESS;
}