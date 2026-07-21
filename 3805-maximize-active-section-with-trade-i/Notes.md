I start by counting the number of 1s in the original string, since that forms the initial answer.

Then, I create a new string by adding a 1 at both ends:

"1" + s + "1"

These extra 1s are only used to simplify handling edge cases and are not included in the final count.

Next, I divide the augmented string into consecutive groups (runs) of identical characters.

For each run of 1s, I check whether it is surrounded by runs of 0s on both sides. If it is, that block is eligible for a trade.

The gain from selecting such a block equals the sum of the lengths of the adjacent zero runs:

leftZeroLength + rightZeroLength

I compute this value for every valid 1 block and keep track of the maximum gain.

Finally, I add this maximum gain to the original count of 1s. If no valid 1 block is found, the gain remains 0, so the original count is already the maximum possible answer.
