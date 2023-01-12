create table if not exists "books"
(
    id          uuid DEFAULT gen_random_uuid() primary key,
    title       VARCHAR(120) not null,
    author      VARCHAR(60) not null,
    description TEXT        not null,
    pages       INT         not null
);

insert into books (title, author, description, pages)
values ('Can ''t hurt me, David Goggins', 'David Goggins', 'Story of a navy seal', 300);

insert into books (title, author, description, pages)
values ('Think Big and Kick Ass: In Business and in Life',
        'Donald Trump', 'Donald J. Trump is an icon: the very definition of the American success story. President-elect, reality-television star, and developer of some of the planet''s most prestigious real estate, he''s also become one of the world''s wealthiest men.',
        240);

insert into books (title, author, description, pages)
values ('Permanent Record: A Memoir of a Reluctant Whistleblower', 'Edward Snowden',
        'Edward Snowden, the man who risked everything to expose the US government’s system of mass surveillance, reveals for the first time the story of his life, including how he helped to build that system and what motivated him to try to bring it down.',
        400);

insert into books (title, author, description, pages)
values ('Elon Musk: Tesla, SpaceX, and the Quest for a Fantastic Future', 'Ashlee Vance',
        'In the spirit of Steve Jobs and Moneyball, Elon Musk is both an illuminating and authorized look at the extraordinary life of one of Silicon Valley’s most exciting, unpredictable, and ambitious entrepreneurs—a real-life Tony Stark—and a fascinating exploration of the renewal of American invention and its new “makers.”',
        400);

insert into books (title, author, description, pages)
values ('Steve Jobs: The Exclusive Biography', 'Walter Isaacson',
        'Based on more than forty interviews with Steve Jobs conducted over two years - as well as interviews with more than a hundred family members, friends, adversaries, competitors, and colleagues - this is the acclaimed, internationally bestselling biography of the ultimate icon of inventiveness.',
        592);