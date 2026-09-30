def make_list():
    team_number = int (input ("How many teams in a hackathlon?"))
    teamlist = [0] * team_number
    for i in range(team_number):
        print("How many members in team", i)
        teamlist[i] = int (input ("? "))
    return teamlist

print(make_list())