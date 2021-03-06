package io.groud.leetcode.algo.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/4sum-ii/
 *
 * @author Li.Wei by 2020/3/8
 */
public class _454_JAVA_四数相加II {

    /*
    [-1,1,1,1,-1]
    [0,-1,-1,0,1]
    [-1,-1,1,-1,-1]
    [0,1,0,-1,-1]
    
    [-71978474,-28407390,6487156,-5835667,-11819338,10343068,10768673,-245171709,19738959,-46339242,181229419,-176760610,-10337980,-207358751,-185412148,102500358,107833574,250545333,-58873985,106821619,268124880,55520158,256155403,200249464,256954749,-41670481,-172102420,-161776521,176941695,-53603760,-67111857,-27713855,-55333948,-215813542,-107067147,98930659,253393156,-196098380,-33056959,174630496,-29395310,105695498,-222391169,-139701651,-123000784,38165534,-98009887,82676096,-209663935,91254707,243440023,96495216,-186156509,192203188,217929656,222248651,162150902,95296092,182504655,964973,223447285,16336100,-202534131,198076772,-218094374,43698098,176419657,-148324200,-143785502,-157834380,265043122,122589079,-184038991,-162395984,-246936037,-77713118,241047628,215897753,112046993,-134358912,-195563478,210843289,205546356,258601177,214037482,-88343952,-252950129,56615227,-206466635,121363993,-234468310,125536942,-76584060,16648767,-81242925,-119529825,70623988,-61229934,129414837,-5...
    [-30451425,-70958332,210992111,205315439,-40697451,249064743,136919380,141811620,217809708,84862193,124181888,190073003,217255261,-146099934,-98347381,-188970320,-189520835,-196693669,-127181028,-37092694,23240047,165035085,-234215571,-68334211,-154429032,-97395972,-33804361,-133637989,211888049,-30348379,147378248,-35110616,-66967243,-63716249,235688198,194876519,8766406,-101004212,-119560841,161953247,235889818,-69837369,120219758,54359594,-230930108,-94345364,-176514522,-177207433,-239072452,-175277854,-257945724,42134263,139262048,192910401,-251072472,-93121657,14338273,-135463675,22787668,202112183,85360562,-233308782,-141664407,123027502,-167152407,237952051,-245273877,200776728,28170793,-7854067,250290131,56039764,35303236,3451395,-171190144,126658080,216820051,195727076,218034224,-54821190,-181431716,67427047,200230427,184601460,263219567,-197804478,29571019,-178614705,-253928825,-32169910,69544559,-130814412,-251036718,53157593,149486805,9340434,-108565593,1418302,57992949,-11...
    [221669372,-198001620,15244180,-85651914,187512073,183505647,-240495316,33170893,131048656,-184341503,-110422027,-116580036,83528072,-44275735,-245936274,-190744927,-174915154,139891567,-211574228,233659572,131414598,124377872,-245383956,-196554724,212256846,157139407,-232406115,-50504444,84387077,256372616,-204508328,235560486,163405342,-219350391,-151874466,-221399919,-90022570,-63892624,-80441153,143952693,22150513,-17877846,208084922,209533876,199282852,28946431,46895507,-109841246,208817335,254839546,-54788427,138210737,-94182109,-160046898,-243841335,97943949,106437630,32443000,-32273081,-115665080,-257611236,-89503963,6858125,-91171476,-157980323,-106139384,-150994306,175237808,164280223,-127483402,173787699,-94584308,-116134557,-210457779,-33000660,-109983682,136658341,89750297,-165637581,104488287,-159182529,47355696,-104681840,-148765655,12703836,210946062,226838746,-11560240,153753586,30612560,-171344239,158232960,-35044863,-10186681,232338329,75475309,37740825,11228185,2149...
    [-17546607,214071333,-93657289,-165621387,-11839282,198176602,-64912029,-192474743,-2493976,99990929,167486438,-106329152,184859425,-264773630,169472755,41413055,-251096373,-80110364,30069861,75320581,185695928,195317818,-115725122,-7487907,-158784107,-196023923,-66900235,161414843,-25937463,145835332,-202898499,259829266,-74026668,-157319850,149881225,43799905,-123466453,147330916,-152436728,221835577,-248543497,20714983,-12614768,239832417,-110657465,43561912,165071752,-7463783,78065931,155976364,213922644,-217800666,117615362,24707363,-185565434,-2496567,234450588,210298310,4529768,-113829319,147184434,19829806,-65480417,-223367800,-236359076,163678294,125913316,-188623095,59555496,-111797935,58175523,-259346726,-33248128,-229144880,-160843897,27494232,-104453818,89063257,249059089,69323436,247770901,1155380,-148019049,-160968762,-52326738,82325533,-150756244,-104804188,-46356628,94794403,-261182860,-10420423,233904773,-80564795,-217303247,248709484,-217368590,203569371,266588872,-1...
    
     */
    // 暴力循环
    class Solution {
        public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
            int count = 0;
            for (int a : A) {
                int sum = a;
                for (int b : B) {
                    sum += b;
                    for (int c : C) {
                        sum += c;
                        for (int d : D) {
                            if (sum + d == 0)
                                count++;
                        }
                        sum -= c;
                    }
                    sum -= b;
                }
            }
            return count;
        }
    }

    // 暴力循环
    class Solution2 {
        public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
            int count = 0;
            for (int a : A) {
                for (int b : B) {
                    for (int c : C) {
                        for (int d : D) {
                            if (a + b + c + d == 0)
                                count++;
                        }
                    }
                }
            }
            return count;
        }
    }

    // hash 优化，两两合并后，取反即相加即为 0
    class Solution3 {
        public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
            Map<Integer, Integer> map = new HashMap();
            int count = 0;
            // 如果 a+b 出现过，出现次数加一
            for (int a : A)
                for (int b : B)
                    map.put(a + b, map.getOrDefault(a + b, 0) + 1);
            // -c-d 与 （a+b）如果相等说明和为 0，次数加一
            for (int c : C)
                for (int d : D)
                    count += map.getOrDefault(-c - d, 0);
            return count;
        }
    }

    // 耗时较短题解
    class Solution4 {

        public class Node {

            private int value;
            private int visit;
            private Node next;

            public Node(int value) {
                this.value = value;
            }

            public Node(int value, int visit, Node next) {
                this.value = value;
                this.visit = visit;
                this.next = next;
            }

            public Node insert(Node head, int value) {
                return new Node(value, 0, head);
            }
        }

        public class HashMap {

            private int max = 2 << 17;
            private int hashKey = max - 1;
            private Node[] myHash = new Node[max];

            public HashMap(int random) {}

            // a % (2^n) 等价于 a & (2^n - 1)
            public int getKey(int value) {
                value = (value < 0 ? -value : value);
                return (value ^ (value >>> 16)) & hashKey;
            }

            public void insert(int value) {
                int key = getKey(value);
                if (myHash[key] == null) {
                    myHash[key] = new Node(value, 1, null);
                    return;
                }
                Node head = myHash[key];
                while (head != null) {
                    if (head.value == value) {
                        head.visit++;
                        return;
                    }
                    head = head.next;
                }
                myHash[key] = myHash[key].insert(myHash[key], value);
                myHash[key].visit = 1;
            }

            public int find(int value) {
                int count = 0, key = getKey(value);
                Node head = myHash[key];
                while (head != null) {
                    if (head.value == value) {
                        return head.visit;
                    }
                    head = head.next;
                }
                return count;
            }
        }

        public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
            int length = C.length;
            if (length < 1)
                return 0;
            HashMap map = new HashMap(B[0]);
            int count = 0, i, j, sum;

            for (i = 0; i < length; i++) {
                int i1 = C[i];
                for (j = 0; j < length; j++) {
                    map.insert(i1 + D[j]);
                }
            }

            for (i = 0; i < length; i++) {
                sum = -A[i];
                for (j = 0; j < length; j++) {
                    count += map.find(sum - B[j]);
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        System.out.println(0x7ffff);
        int max = 2 << 4;

        // a % (2^n) 等价于 a & (2^n - 1)
        // x 的 相反数 表示为 (~x+1)
        // 80110364,30069861,75320581,185695928,195317818
        // 16777216
        // 4194304
        // 64912029
        System.out.println(1 << 22);
        System.out.println(max);
        System.out.println((~(111 & 15) + 1));
    }
}
