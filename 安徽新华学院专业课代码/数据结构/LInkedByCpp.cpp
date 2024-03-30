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
 * TODO:��ʼ��һ��������ͷ�ڵ㣩
 * @param L :ָ��LNode�ṹ���͵�����
 * @return : ����ֵ
 */
bool InitLinkList(LinkList &L) {
//    ����ռ�
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
 * @param value:�ڵ�Ҫ��ŵ�ֵ
 * @return :���ش����Ľڵ�
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
 * ͷ����
 * @param L:Ҫ�������������
 * @param node : ��Ҫ����������Ľڵ�
 */
void firstInsert(LinkList &L, LNode *node) {
    node->next = L->next;
    L->next = node;
}

/**
 * ���㴴��������(ͷ��)
 * @return:��������
 */
LinkList CreateLinkListTool() {
    LinkList L;
    bool isSucceed = InitLinkList(L);
    if (isSucceed) {
        int value;
        cout << "��������Ҫ����ڵ��ֵ��";
        scanf("%d", &value);
        while (value != 0) {
            LNode *pNode = CreateNode(value);
            if (pNode == nullptr) {
                return L;
            } else {
                firstInsert(L, pNode);
            }
            cout << "��������Ҫ����ڵ��ֵ��";
            scanf("%d", &value);
        }
    } else {
        cout << "��������ʧ��";
        return nullptr;
    }
    return L;
}

/**
 * ��������
 * @param L:���������
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
//    ���Lָ��ĵ�ַΪ��,��ô������ֱ�ӷ��ؼ���
    if(L == nullptr){
        return;
    }
    LNode *node = L->next;
    if (node == nullptr)
}*/


//����Ĳ���
void Insert(LinkList &L, int site, int num) {
    if (L == nullptr) {
        return;
    }
    LNode *pNode = CreateNode(num);
//    ��������λ���ǵ�һ��˵�����е���ͷ����ôֱ�ӵ���ͷ�弴��
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
