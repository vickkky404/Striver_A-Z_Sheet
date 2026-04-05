class Solution:
    # Function to print Pattern 2
    def pattern2(self, N):
        for i in range(N):
            print("* " * (i + 1))

if __name__ == "__main__":
    # Create solution object
    sol = Solution()
    N = 5
    sol.pattern2(N)
