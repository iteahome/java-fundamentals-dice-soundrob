public class RollDice {

        public static int findGirls(String s, int x)
        {

            int seqv = 0;

            for (int i = 0; i < s.length(); i++)
            {

                if (s.charAt(i) - '0' != x)
                    seqv++;
            }
            return seqv;
        }

        public static void main(String args[])
        {
            String s = "45661661";
            int x = 6;
            System.out.println(findGirls(s, x));

    }

}
