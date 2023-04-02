//public static int Karamba(int k, int[] a, int s, int e)
//{
//    if (s == e)
//    {
//      if (a[s] > k) return a[s];
//      else return 0;
//    }
//    else
//    {
//      int p1 = Karamba(k, a, s, (s + e) / 2);
//      int p2 = Karamba(k, a, ((s + e) / 2) + 1, e);
//      return p1 + p2;
//    }
//}