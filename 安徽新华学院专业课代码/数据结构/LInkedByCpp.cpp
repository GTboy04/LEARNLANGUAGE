//
// Created by FZHgt on 2024/3/14.
//

#include "stdlib.h"
#include "iostream"

using namespace std;

typedef struct LNode {
    int data;
    struct LNode *next;
} LNode, *LinkList;

//
/**
 * TODO:初始化一个单链表（头节点）
 * @param L :指向LNode结构类型的引用
 * @return : 布尔值
 */
bool InitLinkList(LinkList &L) {
//    申请空间
    L = (LNode *) malloc(sizeof(LNode));
    if (L == nullptr) {
        return false;
    } else {
        L->next = nullptr;
        return true;
    }
}

/**
 *
 * @param value:节点要存放的值
 * @return :返回创建的节点
 */
LNode *CreateNode(int value) {
    LNode *node; // node -->null
    node = (LNode *) malloc(sizeof(LNode));
    if (node == nullptr) {
        return nullptr;
    } else {
        node->next = nullptr;
        node->data = value;
        return node;
    }

}

/**
 * 头插入
 * @param L:要插入的链表引用
 * @param node : 将要被插入链表的节点
 */
void firstInsert(LinkList &L, LNode *node) {
    node->next = L->next;
    L->next = node;
}

/**
 * 方便创建链表复制(头插)
 * @return:反回链表
 */
LinkList CreateLinkListTool() {
    LinkList L;
    bool isSucceed = InitLinkList(L);
    if (isSucceed) {
        int value;
        cout << "请输入你要插入节点的值：";
        scanf("%d", &value);
        while (value != 0) {
            LNode *pNode = CreateNode(value);
            if (pNode == nullptr) {
                return L;
            } else {
                firstInsert(L, pNode);
            }
            cout << "请输入你要插入节点的值：";
            scanf("%d", &value);
        }
    } else {
        cout << "创建链表失败";
        return nullptr;
    }
    return L;
}

/**
 * 遍历链表
 * @param L:链表的引用
 */
void showLinkList(LinkList &L) {
    LNode *node = L->next;
    while (node != nullptr) {
        cout << node->data << endl;
        node = node->next;
    }
}

/*
void TailInsert(LinkList &L){
//    如果L指向的地址为空,那么方法就直接返回即可
    if(L == nullptr){
        return;
    }
    LNode *node = L->next;
    if (node == nullptr)
}*/


//链表的插入
void Insert(LinkList &L, int site, int num) {
    if (L == nullptr) {
        return;
    }
    LNode *pNode = CreateNode(num);
//    如果插入的位置是第一个说明进行的是头插那么直接调用头插即可
    if (site == 1) {
        firstInsert(L, pNode);
        return;
    }
//    int count = 0;
    LNode *node = L->next;
    for (int i = 1; i < site - 1; ++i) {
        if (node->next == nullptr) {
            node->next = pNode;
            return;
        }
        node = node->next;
    }
    pNode->next = node->next;
    node->next = pNode;
}

void deleteBySite(LinkList &L, int site) {
    if (L == nullptr|| L->next == nullptr) {
        return;
    }
    LNode *node = L->next;
    if (site == 1) {
        LNode *temp = L->next;
        L->next = L->next->next;
        free(temp);
        return;
    }

    for (int i = 1; i < site - 1; ++i) {
        if (node->next == nullptr || node->next->next == nullptr) {
            free(node->next);
            node->next = nullptr;
            return;
        }
        node = node->next;
    }
    LNode *tempNode = node->next;
    node->next = node->next->next;
    free(tempNode);
}


int main() {
/*    LinkList L;
    InitLinkList(L);
    LNode* node1 = CreateNode(1);
    LNode* node2 = CreateNode(2);

    firstInsert(L,node1);
    firstInsert(L,node2);
    cout<<L->next->data<<endl;
    cout<<L->next->next->data<<endl;*/

/*    LinkList pNode = CreateLinkListTool();
    showLinkList(pNode);*/

    LinkList L;
    InitLinkList(L);
    LNode *node1 = CreateNode(1);
//    LNode* node2 = CreateNode(2);
//    LNode* node3 = CreateNode(3);
//    LNode* node4 = CreateNode(4);
//    LNode* node5 = CreateNode(5);
    firstInsert(L, node1);
//    firstInsert(L,node2);
//    firstInsert(L,node3);
//    firstInsert(L,node4);
//    firstInsert(L,node5);

//    Insert(L,7,0);

    deleteBySite(L, 7);

    showLinkList(L);

//    LNode *p = CreateNode(1);


    return EXIT_SUCCESS;
}
